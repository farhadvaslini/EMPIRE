package com.empire.game;

import java.net.InetSocketAddress;
import java.net.Socket;

/** Simple TCP reachability check. This is not an SA-MP protocol handshake. */
public final class ServerProbe {
    private ServerProbe() {}

    public static String check(String host, int port, int timeoutMs) {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(host, port), timeoutMs);
            return "سرور قابل دسترسی است.";
        } catch (Exception e) {
            return "اتصال شبکه برقرار نشد: " + e.getClass().getSimpleName();
        }
    }
}
