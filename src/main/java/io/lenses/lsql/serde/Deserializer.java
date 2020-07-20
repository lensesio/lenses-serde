package io.lenses.lsql.serde;

import org.apache.avro.generic.GenericRecord;

import java.io.Closeable;
import java.io.IOException;

public interface Deserializer extends Closeable {
    GenericRecord deserialize(byte[] bytes) throws IOException;
}
