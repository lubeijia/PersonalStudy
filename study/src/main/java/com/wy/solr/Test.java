package com.wy.solr;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.params.MapSolrParams;

import java.io.IOException;
import java.sql.*;
import java.util.*;

/**
 * @program: testSolr
 * @description:
 * @author: Wuyong
 * @create: 2019-04-09 16:38
 **/
public class Test {

    public static void testSolrSql() throws SQLException {
        Connection con = null;
        String zkHost = "10.10.51.31:2181,10.10.51.32:2181,10.10.51.33:2181";

        ResultSet rs = null;
        Statement stmt = null;
        try {
            Calendar t1 = Calendar.getInstance();
            con = DriverManager.getConnection("jdbc:solr://" + zkHost + "?collection=vehicle10&aggregationMode=map_reduce&numWorkers=2");
            Calendar t2 = Calendar.getInstance();
            System.out.println("con====="+(t2.getTimeInMillis()-t1.getTimeInMillis()));
            stmt = con.createStatement();
            Calendar t3 = Calendar.getInstance();
            System.out.println("stmt====="+(t3.getTimeInMillis()-t2.getTimeInMillis()));
            rs = stmt.executeQuery("SELECT id, dataSource  FROM vehicle10 where id = '1774616035UNKNOWN851,605,242,2391541472552486' LIMIT 10");
            Calendar t4 = Calendar.getInstance();
            System.out.println("rs====="+(t4.getTimeInMillis()-t3.getTimeInMillis()));
            while (rs.next()) {
                String id = rs.getString("id");
                int dataSource = rs.getInt("dataSource");
                System.out.println(id + "==========" + dataSource);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null)
                rs.close();
            if (stmt != null)
                stmt.close();
            if (con != null)
                con.close();
        }
    }
    public static void testSolrJ() throws IOException, SolrServerException {
        List<String> zkHosts = new ArrayList<>();
        zkHosts.add("10.10.51.31:2181");
        zkHosts.add("10.10.51.32:2181");
        zkHosts.add("10.10.51.33:2181");
        Optional<String> zkChroot = Optional.ofNullable(null);
        Calendar t1 = Calendar.getInstance();
        CloudSolrClient client = new CloudSolrClient.Builder(zkHosts,zkChroot).build();
        Calendar t2 = Calendar.getInstance();
        System.out.println("connect====="+(t2.getTimeInMillis()-t1.getTimeInMillis()));
         Map<String, String> queryParamMap = new HashMap<String, String>();
        queryParamMap.put("q", "id:1774616035UNKNOWN851,605,242,2391541472552486");
//        queryParamMap.put("fl", "id, name");
//        queryParamMap.put("sort", "id asc");
        MapSolrParams queryParams = new MapSolrParams(queryParamMap);

         QueryResponse response = client.query("vehicle10", queryParams);
         SolrDocumentList documents = response.getResults();
        Calendar t3 = Calendar.getInstance();
        System.out.println("query====="+(t3.getTimeInMillis()-t2.getTimeInMillis()));
        System.out.println("Found " + documents.getNumFound() + " documents");
        for(SolrDocument document : documents) {
            final String id = (String) document.getFirstValue("id");
            final int dataSource = (Integer) document.getFirstValue("dataSource");

            System.out.println("id: " + id + "; dataSource: " + dataSource);
        }
        client.close();
    }


    public static void main(String[] args) throws SQLException, IOException, SolrServerException {
        Test.testSolrSql();
        Test.testSolrJ();
    }
}
