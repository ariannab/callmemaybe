package org.callmemaybe.output.util;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class CMMToRandoopSerializer implements JsonSerializer<CMMToRandoop> {

    @Override
    public JsonElement serialize(CMMToRandoop src, Type typeOfSrc, JsonSerializationContext context) {
        return new GsonBuilder().create().toJsonTree(src);
    }
}
