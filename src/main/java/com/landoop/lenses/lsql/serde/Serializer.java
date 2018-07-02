package com.landoop.lenses.lsql.serde;

import org.apache.avro.generic.GenericRecord;

import java.io.Closeable;
import java.io.IOException;

public interface Serializer extends Closeable {
    byte[] serialize(GenericRecord record) throws IOException;
}
