package com.landoop.lenses.lsql.serde;

import org.apache.avro.generic.GenericRecord;

import java.io.Closeable;

public interface Serializer extends Closeable {
    byte[] serialize(GenericRecord record);
}
