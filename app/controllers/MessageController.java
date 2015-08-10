package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by Kavya on 10-08-2015.
 */
public class MessageController extends Controller {


    public Result saveMessage() {
        return ok(Json.toJson("save"));
    }

    public Result getMessage() {
        return ok(Json.toJson("get"));
    }

    public Result getMessages() {
        return ok(Json.toJson("gets"));
    }

    public Result updateMessage() {
        return ok(Json.toJson("update"));
    }

    public Result deleteMessage() {
        return ok(Json.toJson("delete"));
    }
}
