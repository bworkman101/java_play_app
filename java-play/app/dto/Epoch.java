package dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Epoch {

  private final long epochTime;

  @JsonCreator
  public Epoch(@JsonProperty("epochTime") long epochTime) {
    this.epochTime = epochTime;
  }

  public long getEpochTime() {
    return epochTime;
  }
}
