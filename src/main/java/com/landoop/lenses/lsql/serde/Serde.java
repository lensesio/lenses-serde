package com.landoop.lenses.lsql.serde;

import java.util.Properties;

public interface Serde {
    Serializer serializer(String topic, Properties properties);

    Deserializer deserializer(String topic, Properties properties);
}