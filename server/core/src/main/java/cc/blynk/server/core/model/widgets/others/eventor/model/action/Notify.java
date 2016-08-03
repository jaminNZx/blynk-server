package cc.blynk.server.core.model.widgets.others.eventor.model.action;

import io.netty.channel.ChannelHandlerContext;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 01.08.16.
 */
public class Notify extends BaseAction {

    public String message;

    public Notify() {
    }

    public Notify(String message) {
        this.message = message;
    }

    @Override
    public void execute(ChannelHandlerContext ctx) {

    }
}