package top.th1nk.samp.feature.game;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.av0;
import defpackage.bv0;
import defpackage.by1;
import defpackage.cs0;
import defpackage.cv0;
import defpackage.dm3;
import defpackage.gv0;
import defpackage.hv0;
import defpackage.lh0;
import defpackage.nc2;
import defpackage.ns0;
import defpackage.ok2;
import defpackage.s51;
import defpackage.ti;
import defpackage.tu0;
import defpackage.ui;
import defpackage.v;
import defpackage.vb;
import defpackage.xu0;
import defpackage.y02;
import defpackage.y6;
import defpackage.yu0;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import top.th1nk.samp.feature.game.GameAudioPlayer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class GameAudioPlayer {
    public static final int $stable = 0;
    private static final int CLEO_STATE_PAUSED = 2;
    private static final int CLEO_STATE_PLAYING = 1;
    private static final int CLEO_STATE_STOPPED = -1;
    private static final String TAG = "GameAudioPlayer";
    private static MediaPlayer mediaPlayer;
    public static final GameAudioPlayer INSTANCE = new GameAudioPlayer();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private static final ConcurrentHashMap<Integer, gv0> cleoStreams = new ConcurrentHashMap<>();
    private static final AtomicInteger nextCleoStreamId = new AtomicInteger(1);

    private GameAudioPlayer() {
    }

    private final void animateStreamValue(int i, gv0 gv0Var, int i2, float f, float f2, cs0 cs0Var, ns0 ns0Var) {
        mainHandler.post(new hv0(i, gv0Var, cs0Var, SystemClock.uptimeMillis(), i2, ns0Var, f, f2));
    }

    private final void applyPlaybackSpeed(gv0 gv0Var, MediaPlayer mediaPlayer2) {
        if (gv0Var.f <= 0.0f) {
            return;
        }
        try {
            mediaPlayer2.setPlaybackParams(new PlaybackParams().setSpeed(gv0Var.f));
        } catch (Exception e) {
            ti tiVar = ui.a;
            ui.c(ti.j, TAG, by1.g("CLEO audio speed update failed: ", e.getMessage()), null);
        }
    }

    private final void applySpeedAndPlaybackState(gv0 gv0Var) {
        MediaPlayer mediaPlayer2 = gv0Var.n;
        if (mediaPlayer2 != null && gv0Var.b) {
            try {
                if (gv0Var.f <= 0.0f) {
                    if (mediaPlayer2.isPlaying()) {
                        mediaPlayer2.pause();
                    }
                } else {
                    applyPlaybackSpeed(gv0Var, mediaPlayer2);
                    if (gv0Var.a != 1 || mediaPlayer2.isPlaying() || nativeShouldAudioPause()) {
                        return;
                    }
                    mediaPlayer2.start();
                }
            } catch (Exception unused) {
            }
        }
    }

    private final void applyVolume(gv0 gv0Var) {
        if (gv0Var.b) {
            try {
                float fG = y02.g(gv0Var.e * gv0Var.k, 0.0f, 1.0f);
                MediaPlayer mediaPlayer2 = gv0Var.n;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setVolume(fG, fG);
                }
            } catch (Exception unused) {
            }
        }
    }

    private final float calculateSpatialGain(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f - f4;
        float f10 = f2 - f5;
        float f11 = f3 - f6;
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10) + (f9 * f9));
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        float f12 = 0.001f + f7;
        if (f8 < f12) {
            f8 = f12;
        }
        return y02.g(fSqrt <= f7 ? 1.0f : fSqrt >= f8 ? 0.0f : 1.0f - ((fSqrt - f7) / (f8 - f7)), 0.0f, 1.0f);
    }

    public static final float cleoGetStreamDuration(int i) {
        gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        if (gv0Var == null) {
            return 0.0f;
        }
        if (gv0Var.f <= 0.0f) {
            return Float.MAX_VALUE;
        }
        return (gv0Var.c / 1000.0f) / gv0Var.f;
    }

    public static final int cleoGetStreamLength(int i) {
        gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        return (gv0Var != null ? gv0Var.c : 0) / 1000;
    }

    public static final float cleoGetStreamProgress(int i) {
        gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        if (gv0Var == null || gv0Var.c <= 0) {
            return 0.0f;
        }
        return y02.g(gv0Var.d / gv0Var.c, 0.0f, 1.0f);
    }

    public static final float cleoGetStreamProgressSeconds(int i) {
        return (cleoStreams.get(Integer.valueOf(i)) != null ? r1.d : 0) / 1000.0f;
    }

    public static final float cleoGetStreamSpeed(int i) {
        gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        if (gv0Var != null) {
            return gv0Var.f;
        }
        return 0.0f;
    }

    public static final int cleoGetStreamState(int i) {
        gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        return gv0Var != null ? gv0Var.a : CLEO_STATE_STOPPED;
    }

    public static final int cleoGetStreamType(int i) {
        gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        if (gv0Var != null) {
            return gv0Var.g;
        }
        return 0;
    }

    public static final float cleoGetStreamVolume(int i) {
        gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        if (gv0Var != null) {
            return gv0Var.e;
        }
        return 0.0f;
    }

    public static final boolean cleoIsStreamPlaying(int i) {
        gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        return gv0Var != null && gv0Var.a == 1;
    }

    public static final boolean cleoIsStreamValid(int i) {
        return cleoStreams.containsKey(Integer.valueOf(i));
    }

    public static final int cleoLoadStream(String str) {
        int andIncrement;
        str.getClass();
        if (str.length() == 0) {
            return 0;
        }
        ok2 ok2Var = new ok2();
        AtomicInteger atomicInteger = nextCleoStreamId;
        int andIncrement2 = atomicInteger.getAndIncrement();
        ok2Var.f = andIncrement2;
        if (andIncrement2 <= 0) {
            atomicInteger.set(1);
            ok2Var.f = atomicInteger.getAndIncrement();
        }
        do {
            ConcurrentHashMap<Integer, gv0> concurrentHashMap = cleoStreams;
            if (!concurrentHashMap.containsKey(Integer.valueOf(ok2Var.f))) {
                gv0 gv0Var = new gv0();
                gv0Var.a = 2;
                gv0Var.e = 1.0f;
                gv0Var.f = 1.0f;
                gv0Var.g = 1;
                gv0Var.k = 1.0f;
                concurrentHashMap.put(Integer.valueOf(ok2Var.f), gv0Var);
                mainHandler.post(new vb(ok2Var, gv0Var, str, 3));
                return ok2Var.f;
            }
            andIncrement = nextCleoStreamId.getAndIncrement();
            ok2Var.f = andIncrement;
        } while (andIncrement > 0);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleoLoadStream$lambda$0(final ok2 ok2Var, final gv0 gv0Var, String str) {
        if (cleoStreams.get(Integer.valueOf(ok2Var.f)) != gv0Var) {
            return;
        }
        try {
            final MediaPlayer mediaPlayer2 = new MediaPlayer();
            gv0Var.n = mediaPlayer2;
            mediaPlayer2.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
            mediaPlayer2.setDataSource(str);
            mediaPlayer2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: uu0
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer3) {
                    GameAudioPlayer.cleoLoadStream$lambda$0$0$0(ok2Var, gv0Var, mediaPlayer3);
                }
            });
            mediaPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: vu0
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer3) {
                    GameAudioPlayer.cleoLoadStream$lambda$0$0$1(ok2Var, gv0Var, mediaPlayer3);
                }
            });
            mediaPlayer2.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: wu0
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer3, int i, int i2) {
                    GameAudioPlayer.cleoLoadStream$lambda$0$0$2(ok2Var, gv0Var, mediaPlayer2, mediaPlayer3, i, i2);
                    return true;
                }
            });
            mediaPlayer2.prepareAsync();
        } catch (Exception e) {
            ti tiVar = ui.a;
            ui.c(ti.j, TAG, "CLEO audio load failed: id=" + ok2Var.f + " error=" + e.getMessage(), null);
            gv0Var.a = CLEO_STATE_STOPPED;
            try {
                MediaPlayer mediaPlayer3 = gv0Var.n;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.release();
                }
            } catch (Exception unused) {
            }
            gv0Var.n = null;
            cleoStreams.remove(Integer.valueOf(ok2Var.f), gv0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleoLoadStream$lambda$0$0$0(ok2 ok2Var, gv0 gv0Var, MediaPlayer mediaPlayer2) {
        Integer numValueOf;
        if (cleoStreams.get(Integer.valueOf(ok2Var.f)) != gv0Var) {
            mediaPlayer2.release();
            return;
        }
        gv0Var.b = true;
        int duration = mediaPlayer2.getDuration();
        if (duration < 0) {
            duration = 0;
        }
        gv0Var.c = duration;
        mediaPlayer2.setLooping(gv0Var.h);
        GameAudioPlayer gameAudioPlayer = INSTANCE;
        gameAudioPlayer.applyVolume(gv0Var);
        gameAudioPlayer.applyPlaybackSpeed(gv0Var, mediaPlayer2);
        Float f = gv0Var.j;
        if (f != null) {
            numValueOf = Integer.valueOf((int) (f.floatValue() * 1000.0f));
        } else {
            Float f2 = gv0Var.i;
            if (f2 != null) {
                numValueOf = Integer.valueOf((int) (gv0Var.c * f2.floatValue()));
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            gv0Var.d = y02.h(numValueOf.intValue(), 0, gv0Var.c);
            try {
                mediaPlayer2.seekTo(gv0Var.d);
            } catch (Exception unused) {
            }
        }
        gv0Var.j = null;
        gv0Var.i = null;
        INSTANCE.schedulePositionUpdates(ok2Var.f, gv0Var);
        if (gv0Var.a != 1 || gv0Var.f <= 0.0f || nativeShouldAudioPause()) {
            return;
        }
        mediaPlayer2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleoLoadStream$lambda$0$0$1(ok2 ok2Var, gv0 gv0Var, MediaPlayer mediaPlayer2) {
        if (cleoStreams.get(Integer.valueOf(ok2Var.f)) != gv0Var) {
            return;
        }
        gv0Var.a = CLEO_STATE_STOPPED;
        gv0Var.d = 0;
        try {
            mediaPlayer2.seekTo(0);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cleoLoadStream$lambda$0$0$2(ok2 ok2Var, gv0 gv0Var, MediaPlayer mediaPlayer2, MediaPlayer mediaPlayer3, int i, int i2) {
        ti tiVar = ui.a;
        StringBuilder sbL = nc2.l("CLEO audio error: id=", ok2Var.f, " what=", i, " extra=");
        sbL.append(i2);
        ui.c(ti.j, TAG, sbL.toString(), null);
        gv0Var.a = CLEO_STATE_STOPPED;
        gv0Var.b = false;
        gv0Var.n = null;
        cleoStreams.remove(Integer.valueOf(ok2Var.f), gv0Var);
        mediaPlayer2.release();
        return true;
    }

    public static final void cleoRemoveStream(int i) {
        gv0 gv0VarRemove = cleoStreams.remove(Integer.valueOf(i));
        if (gv0VarRemove == null) {
            return;
        }
        gv0VarRemove.a = CLEO_STATE_STOPPED;
        mainHandler.post(new v(9, gv0VarRemove));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleoRemoveStream$lambda$0(gv0 gv0Var) {
        MediaPlayer mediaPlayer2 = gv0Var.n;
        if (mediaPlayer2 == null) {
            return;
        }
        gv0Var.n = null;
        gv0Var.b = false;
        try {
            if (mediaPlayer2.isPlaying()) {
                mediaPlayer2.stop();
            }
        } catch (Exception unused) {
        }
        try {
            mediaPlayer2.release();
        } catch (Exception unused2) {
        }
    }

    public static final void cleoSetStreamLooped(final int i, final boolean z) {
        final gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        if (gv0Var == null) {
            return;
        }
        gv0Var.h = z;
        mainHandler.post(new Runnable() { // from class: dv0
            @Override // java.lang.Runnable
            public final void run() {
                GameAudioPlayer.cleoSetStreamLooped$lambda$0(i, gv0Var, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleoSetStreamLooped$lambda$0(int i, gv0 gv0Var, boolean z) {
        if (cleoStreams.get(Integer.valueOf(i)) != gv0Var) {
            return;
        }
        try {
            MediaPlayer mediaPlayer2 = gv0Var.n;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setLooping(z);
            }
        } catch (Exception unused) {
        }
    }

    public static final void cleoSetStreamProgress(int i, float f) {
        gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        if (gv0Var == null) {
            return;
        }
        mainHandler.post(new av0(i, gv0Var, 2, y02.g(f, 0.0f, 1.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleoSetStreamProgress$lambda$0(int i, gv0 gv0Var, float f) {
        if (cleoStreams.get(Integer.valueOf(i)) != gv0Var) {
            return;
        }
        gv0Var.j = null;
        gv0Var.i = Float.valueOf(f);
        if (gv0Var.b) {
            gv0Var.i = null;
            gv0Var.d = y02.h((int) (gv0Var.c * f), 0, gv0Var.c);
            try {
                MediaPlayer mediaPlayer2 = gv0Var.n;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.seekTo(gv0Var.d);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static final void cleoSetStreamProgressSeconds(int i, float f) {
        gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        if (gv0Var == null) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        mainHandler.post(new av0(i, gv0Var, 1, f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleoSetStreamProgressSeconds$lambda$0(int i, gv0 gv0Var, float f) {
        if (cleoStreams.get(Integer.valueOf(i)) != gv0Var) {
            return;
        }
        gv0Var.i = null;
        gv0Var.j = Float.valueOf(f);
        if (gv0Var.b) {
            int iH = y02.h((int) (f * 1000.0f), 0, gv0Var.c);
            gv0Var.j = null;
            gv0Var.d = iH;
            try {
                MediaPlayer mediaPlayer2 = gv0Var.n;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.seekTo(iH);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static final void cleoSetStreamSpeed(int i, float f) {
        gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        if (gv0Var == null) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        mainHandler.post(new av0(i, gv0Var, 3, f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleoSetStreamSpeed$lambda$0(int i, gv0 gv0Var, float f) {
        if (cleoStreams.get(Integer.valueOf(i)) != gv0Var) {
            return;
        }
        gv0Var.m++;
        gv0Var.f = f;
        INSTANCE.applySpeedAndPlaybackState(gv0Var);
    }

    public static final void cleoSetStreamSpeedWithTransition(int i, float f, int i2) {
        gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        if (gv0Var == null) {
            return;
        }
        mainHandler.post(new cv0(i, gv0Var, i2, f < 0.0f ? 0.0f : f, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleoSetStreamSpeedWithTransition$lambda$0(int i, gv0 gv0Var, int i2, float f) {
        if (cleoStreams.get(Integer.valueOf(i)) != gv0Var) {
            return;
        }
        if (i2 <= 0) {
            gv0Var.m++;
            gv0Var.f = f;
            INSTANCE.applySpeedAndPlaybackState(gv0Var);
            return;
        }
        gv0Var.a = 1;
        int i3 = gv0Var.m + 1;
        gv0Var.m = i3;
        float f2 = gv0Var.f;
        if (gv0Var.b && f2 > 0.0f && !nativeShouldAudioPause()) {
            try {
                MediaPlayer mediaPlayer2 = gv0Var.n;
                if (mediaPlayer2 != null && !mediaPlayer2.isPlaying()) {
                    mediaPlayer2.start();
                }
            } catch (Exception unused) {
            }
        }
        int i4 = 0;
        INSTANCE.animateStreamValue(i, gv0Var, i2, f2, f, new tu0(i3, gv0Var, i4), new bv0(i4, gv0Var));
    }

    private static final boolean cleoSetStreamSpeedWithTransition$lambda$0$1(int i, gv0 gv0Var) {
        return i == gv0Var.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dm3 cleoSetStreamSpeedWithTransition$lambda$0$2(gv0 gv0Var, float f) {
        gv0Var.f = f;
        INSTANCE.applySpeedAndPlaybackState(gv0Var);
        return dm3.a;
    }

    public static final void cleoSetStreamState(final int i, final int i2) {
        final gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        if (gv0Var == null) {
            return;
        }
        if (i2 == CLEO_STATE_STOPPED || i2 == 1 || i2 == 2) {
            gv0Var.a = i2;
            mainHandler.post(new Runnable() { // from class: fv0
                @Override // java.lang.Runnable
                public final void run() {
                    GameAudioPlayer.cleoSetStreamState$lambda$0(i, gv0Var, i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleoSetStreamState$lambda$0(int i, gv0 gv0Var, int i2) {
        MediaPlayer mediaPlayer2;
        if (cleoStreams.get(Integer.valueOf(i)) == gv0Var && (mediaPlayer2 = gv0Var.n) != null) {
            try {
                if (i2 == CLEO_STATE_STOPPED) {
                    if (gv0Var.b) {
                        if (mediaPlayer2.isPlaying()) {
                            mediaPlayer2.pause();
                        }
                        mediaPlayer2.seekTo(0);
                        gv0Var.d = 0;
                        return;
                    }
                    return;
                }
                if (i2 != 1) {
                    if (i2 == 2 && gv0Var.b && mediaPlayer2.isPlaying()) {
                        mediaPlayer2.pause();
                        return;
                    }
                    return;
                }
                if (!gv0Var.b || gv0Var.f <= 0.0f || mediaPlayer2.isPlaying() || nativeShouldAudioPause()) {
                    return;
                }
                INSTANCE.applyPlaybackSpeed(gv0Var, mediaPlayer2);
                mediaPlayer2.start();
            } catch (Exception unused) {
            }
        }
    }

    public static final void cleoSetStreamType(int i, int i2) {
        gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        if (gv0Var == null) {
            return;
        }
        if (i2 != 1 && i2 != 2) {
            i2 = 0;
        }
        gv0Var.g = i2;
    }

    public static final void cleoSetStreamVolume(int i, float f) {
        gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        if (gv0Var == null) {
            return;
        }
        mainHandler.post(new av0(i, gv0Var, 0, y02.g(f, 0.0f, 1.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleoSetStreamVolume$lambda$0(int i, gv0 gv0Var, float f) {
        if (cleoStreams.get(Integer.valueOf(i)) != gv0Var) {
            return;
        }
        gv0Var.l++;
        gv0Var.e = f;
        INSTANCE.applyVolume(gv0Var);
    }

    public static final void cleoSetStreamVolumeWithTransition(int i, float f, int i2) {
        gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        if (gv0Var == null) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        mainHandler.post(new cv0(i, gv0Var, i2, f > 1.0f ? 1.0f : f, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleoSetStreamVolumeWithTransition$lambda$0(int i, gv0 gv0Var, int i2, float f) {
        if (cleoStreams.get(Integer.valueOf(i)) != gv0Var) {
            return;
        }
        int i3 = 1;
        if (i2 <= 0) {
            gv0Var.l++;
            gv0Var.e = f;
            INSTANCE.applyVolume(gv0Var);
            return;
        }
        gv0Var.a = 1;
        if (gv0Var.b && gv0Var.f > 0.0f && !nativeShouldAudioPause()) {
            try {
                MediaPlayer mediaPlayer2 = gv0Var.n;
                if (mediaPlayer2 != null) {
                    INSTANCE.applyPlaybackSpeed(gv0Var, mediaPlayer2);
                    if (!mediaPlayer2.isPlaying()) {
                        mediaPlayer2.start();
                    }
                }
            } catch (Exception unused) {
            }
        }
        int i4 = gv0Var.l + 1;
        gv0Var.l = i4;
        INSTANCE.animateStreamValue(i, gv0Var, i2, gv0Var.e, f, new tu0(i4, gv0Var, i3), new bv0(i3, gv0Var));
    }

    private static final boolean cleoSetStreamVolumeWithTransition$lambda$0$1(int i, gv0 gv0Var) {
        return i == gv0Var.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dm3 cleoSetStreamVolumeWithTransition$lambda$0$2(gv0 gv0Var, float f) {
        gv0Var.e = f;
        INSTANCE.applyVolume(gv0Var);
        return dm3.a;
    }

    public static final void cleoUpdateStream3d(final int i, final boolean z, final float f, final float f2, final float f3, final float f4, final float f5, final float f6, final float f7, final float f8) {
        final gv0 gv0Var = cleoStreams.get(Integer.valueOf(i));
        if (gv0Var == null) {
            return;
        }
        mainHandler.post(new Runnable() { // from class: ev0
            @Override // java.lang.Runnable
            public final void run() {
                GameAudioPlayer.cleoUpdateStream3d$lambda$0(i, gv0Var, z, f, f2, f3, f4, f5, f6, f7, f8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleoUpdateStream3d$lambda$0(int i, gv0 gv0Var, boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (cleoStreams.get(Integer.valueOf(i)) != gv0Var) {
            return;
        }
        gv0Var.k = z ? INSTANCE.calculateSpatialGain(f, f2, f3, f4, f5, f6, f7, f8) : 1.0f;
        INSTANCE.applyVolume(gv0Var);
    }

    private static final native boolean nativeShouldAudioPause();

    public static final void pause() {
        mainHandler.post(new y6(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$0() {
        MediaPlayer mediaPlayer2;
        MediaPlayer mediaPlayer3;
        try {
            MediaPlayer mediaPlayer4 = mediaPlayer;
            if (mediaPlayer4 != null) {
                mediaPlayer4.pause();
            }
        } catch (Exception unused) {
        }
        Collection<gv0> collectionValues = cleoStreams.values();
        collectionValues.getClass();
        for (gv0 gv0Var : collectionValues) {
            try {
                if (gv0Var.a == 1 && gv0Var.b && (mediaPlayer2 = gv0Var.n) != null && mediaPlayer2.isPlaying() && (mediaPlayer3 = gv0Var.n) != null) {
                    mediaPlayer3.pause();
                }
            } catch (Exception unused2) {
            }
        }
    }

    public static final void playUrl(String str) {
        str.getClass();
        mainHandler.post(new v(8, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playUrl$lambda$0(String str) {
        INSTANCE.stopInternal();
        try {
            final MediaPlayer mediaPlayer2 = new MediaPlayer();
            mediaPlayer2.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
            mediaPlayer2.setDataSource(str);
            mediaPlayer2.setOnPreparedListener(new xu0());
            mediaPlayer2.setOnCompletionListener(new yu0());
            mediaPlayer2.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: zu0
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer3, int i, int i2) {
                    GameAudioPlayer.playUrl$lambda$0$0$2(mediaPlayer2, mediaPlayer3, i, i2);
                    return true;
                }
            });
            mediaPlayer2.prepareAsync();
            mediaPlayer = mediaPlayer2;
        } catch (Exception e) {
            ti tiVar = ui.a;
            ui.c(ti.j, TAG, by1.g("playUrl failed: ", e.getMessage()), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playUrl$lambda$0$0$0(MediaPlayer mediaPlayer2) {
        ti tiVar = ui.a;
        ti tiVar2 = ti.g;
        ui.c(tiVar2, TAG, "prepared, starting playback", null);
        mediaPlayer2.start();
        if (nativeShouldAudioPause()) {
            ui.c(tiVar2, TAG, "prepared, pausing immediately (game paused or backgrounded)", null);
            mediaPlayer2.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playUrl$lambda$0$0$1(MediaPlayer mediaPlayer2) {
        ti tiVar = ui.a;
        ui.c(ti.g, TAG, "playback completed", null);
        if (s51.n(mediaPlayer, mediaPlayer2)) {
            mediaPlayer = null;
        }
        mediaPlayer2.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean playUrl$lambda$0$0$2(MediaPlayer mediaPlayer2, MediaPlayer mediaPlayer3, int i, int i2) {
        ti tiVar = ui.a;
        ui.c(ti.j, TAG, nc2.g(i, i2, "error: what=", " extra="), null);
        if (s51.n(mediaPlayer, mediaPlayer2)) {
            mediaPlayer = null;
        }
        mediaPlayer2.release();
        return true;
    }

    public static final void resume() {
        mainHandler.post(new y6(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$0() {
        MediaPlayer mediaPlayer2;
        MediaPlayer mediaPlayer3;
        try {
            MediaPlayer mediaPlayer4 = mediaPlayer;
            if (mediaPlayer4 != null) {
                mediaPlayer4.start();
            }
        } catch (Exception unused) {
        }
        Collection<gv0> collectionValues = cleoStreams.values();
        collectionValues.getClass();
        for (gv0 gv0Var : collectionValues) {
            try {
                if (gv0Var.a == 1 && gv0Var.b && ((mediaPlayer2 = gv0Var.n) == null || !mediaPlayer2.isPlaying())) {
                    if (!nativeShouldAudioPause() && (mediaPlayer3 = gv0Var.n) != null) {
                        mediaPlayer3.start();
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    private final void schedulePositionUpdates(int i, gv0 gv0Var) {
        mainHandler.post(new lh0(i, gv0Var));
    }

    public static final void stop() {
        mainHandler.post(new y6(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$0() {
        INSTANCE.stopInternal();
    }

    private final void stopInternal() {
        MediaPlayer mediaPlayer2 = mediaPlayer;
        if (mediaPlayer2 != null) {
            try {
                if (mediaPlayer2.isPlaying()) {
                    mediaPlayer2.stop();
                }
                mediaPlayer2.release();
            } catch (Exception unused) {
            }
            if (s51.n(mediaPlayer, mediaPlayer2)) {
                mediaPlayer = null;
            }
        }
    }
}
