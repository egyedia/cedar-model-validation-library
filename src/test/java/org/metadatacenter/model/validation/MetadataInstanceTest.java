package org.metadatacenter.model.validation;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class MetadataInstanceTest {

  public static void main(String[] args) throws Exception {
    String filename = args[0];

    InputStream in = MetadataInstanceTest.class.getClassLoader().getResourceAsStream(filename);

    JsonNode input = new ObjectMapper().readTree(in);

    String jsonPrint = new MetadataInstance(input).asJson();

    System.out.println(jsonPrint);

    String rdfPrint = new MetadataInstance(input).asRdf();

    System.out.println(rdfPrint);
  }
}
