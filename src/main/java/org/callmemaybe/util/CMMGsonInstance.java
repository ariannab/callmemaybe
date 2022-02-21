package org.callmemaybe.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.callmemaybe.output.util.CMMToRandoop;
import org.callmemaybe.output.util.CMMToRandoopSerializer;

public class CMMGsonInstance {
  /** The Gson object instance. */
  private static final Gson gson =
      new GsonBuilder()
          .registerTypeAdapter(CMMToRandoop.class, new CMMToRandoopSerializer())
          .disableHtmlEscaping()
          .setPrettyPrinting()
          .create();

  /** Disables construction of this class. */
  private CMMGsonInstance() {}

  /**
   * Returns the Gson instance held by this class.
   *
   * @return the Gson instance held by this class
   */
  public static Gson gson() {
    return gson;
  }
}
