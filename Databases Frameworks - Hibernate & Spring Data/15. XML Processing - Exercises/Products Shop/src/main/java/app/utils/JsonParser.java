package app.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Component;

@Component
public class JsonParser {

    private final Gson gson;
    private final FileIO fileIO;

    public JsonParser(FileIO fileIO) {
        this.fileIO = fileIO;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public <T> T objectFromFile(Class<T> tClass, String path) {
        return this.gson.fromJson(this.fileIO.read(path), tClass);
    }

    public <T> void objectToFile(T obj, String path) {
        this.fileIO.write(objectToJson(obj), path);
    }

    public <T> T objectFromJson(Class<T> tClass, String json) {
        return this.gson.fromJson(json, tClass);
    }

    public <T> String objectToJson(T obj) {
        return this.gson.toJson(obj);
    }
}
