package com.laipan.demo.protocol.echo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

public class EchoServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        // 接收到 msg 原样返回
        ctx.write(msg); // (1)
        ctx.flush(); // (2)
//            ctx.writeAndFlush(msg)
        // 与 discard 不同，此处不用 release，因为 netty 在把数据 flush 到网络之后会自动 release
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        cause.printStackTrace();
        ctx.close();
    }
}
