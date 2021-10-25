package org.memo.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.memo.output.util.JsonOutput;
import org.memo.output.util.JsonOutputSerializer;

/** This class holds an instance of a {@code Gson} object. */
public final class GsonInstance {

  /** The Gson object instance. */
  private static final Gson gson =
      new GsonBuilder()
          .registerTypeAdapter(JsonOutput.class, new JsonOutputSerializer())
          .disableHtmlEscaping()
          .setPrettyPrinting()
          .create();

  /** Disables construction of this class. */
  private GsonInstance() {}

  /**
   * Returns the Gson instance held by this class.
   *
   * @return the Gson instance held by this class
   */
  public static Gson gson() {
    return gson;
  }
}
