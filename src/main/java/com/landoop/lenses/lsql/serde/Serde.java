package com.landoop.lenses.lsql.serde;

import org.apache.avro.Schema;

import java.util.Properties;

public interface Serde {
  Serializer serializer(Properties properties);

  Deserializer deserializer(Properties properties);

  Schema getSchema();
}