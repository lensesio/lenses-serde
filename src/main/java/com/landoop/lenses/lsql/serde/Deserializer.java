package com.landoop.lenses.lsql.serde;

import org.apache.avro.generic.GenericRecord;

import java.io.Closeable;

public interface Deserializer extends Closeable {
    GenericRecord deserialize(byte[] bytes);
}
