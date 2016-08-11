package controllers;

import dto.Epoch;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class EpochController extends Controller {

  private Logger LOG = LoggerFactory.getLogger(EpochController.class);

  public Result get() {
    Epoch epoch = new Epoch(System.currentTimeMillis());
    LOG.debug("epoch {}", ToStringBuilder.reflectionToString(epoch));
    return ok(Json.toJson(epoch));
  }

}
