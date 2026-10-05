package defpackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.CancellationException;
import java.util.zip.CRC32;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nu0 extends mb3 implements rs0 {
    public iv2 j;
    public String k;
    public String l;
    public GameActivity m;
    public int n;
    public int o;
    public long p;
    public long q;
    public int r;
    public final /* synthetic */ GameActivity s;
    public final /* synthetic */ long t;
    public final /* synthetic */ int u;
    public final /* synthetic */ String v;
    public final /* synthetic */ long w;
    public final /* synthetic */ String x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu0(GameActivity gameActivity, long j, int i, String str, long j2, String str2, int i2, p40 p40Var) {
        super(2, p40Var);
        this.s = gameActivity;
        this.t = j;
        this.u = i;
        this.v = str;
        this.w = j2;
        this.x = str2;
        this.y = i2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((nu0) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        return new nu0(this.s, this.t, this.u, this.v, this.w, this.x, this.y, p40Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0291, code lost:
    
        r30 = r6;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0295, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0298, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x029d, code lost:
    
        if (r16 <= 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02a2, code lost:
    
        if (r16 != r11) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02b0, code lost:
    
        if (r0.getValue() != (4294967295L & r9)) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02b2, code lost:
    
        r0 = r33.toPath();
        r2 = r30.toPath();
        r3 = new java.nio.file.CopyOption[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02c1, code lost:
    
        r3[0] = java.nio.file.StandardCopyOption.REPLACE_EXISTING;
        java.nio.file.Files.move(r0, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02c6, code lost:
    
        r27.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02c9, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02d4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02de, code lost:
    
        throw new java.lang.IllegalArgumentException(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02e6, code lost:
    
        throw new java.lang.IllegalArgumentException(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02ee, code lost:
    
        throw new java.lang.IllegalArgumentException(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02ef, code lost:
    
        r0 = th;
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws Throwable {
        GameActivity gameActivity;
        iv2 iv2Var;
        String str;
        int i;
        long j;
        int i2;
        GameActivity gameActivity2;
        String str2;
        long j2;
        File file;
        boolean z;
        URL url;
        String str3;
        URL url2;
        File parentFile;
        HttpURLConnection httpURLConnection;
        Throwable th;
        byte[] bArr;
        long j3;
        long j4;
        File file2;
        GameActivity gameActivity3;
        String host;
        InetAddress inetAddress;
        GameActivity gameActivity4 = this.s;
        String str4 = this.v;
        y50 y50Var = y50.f;
        int i3 = this.r;
        try {
            if (i3 == 0) {
                y02.Q(obj);
                iv2Var = su0.a;
                str = this.x;
                i = this.y;
                j = this.t;
                i2 = this.u;
                long j5 = this.w;
                this.j = iv2Var;
                this.k = str4;
                this.l = str;
                this.m = gameActivity4;
                this.n = i;
                this.p = j;
                this.o = i2;
                this.q = j5;
                this.r = 1;
                if (iv2Var.a(this) == y50Var) {
                    return y50Var;
                }
                gameActivity2 = gameActivity4;
                str2 = str4;
                j2 = j5;
            } else {
                if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j6 = this.q;
                i2 = this.o;
                j = this.p;
                i = this.n;
                GameActivity gameActivity5 = this.m;
                str = this.l;
                str2 = this.k;
                iv2Var = this.j;
                y02.Q(obj);
                j2 = j6;
                gameActivity2 = gameActivity5;
            }
            try {
                File file3 = new File(str2);
                try {
                    File file4 = new File(str2 + "." + System.nanoTime() + ".part");
                    try {
                        url = new URL(str);
                        if (!s51.n(url.getProtocol(), "http") && !s51.n(url.getProtocol(), "https")) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        str3 = "";
                        if (s51.n(url.getProtocol(), "http")) {
                            InetAddress[] allByName = InetAddress.getAllByName(url.getHost());
                            allByName.getClass();
                            int length = allByName.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    gameActivity = gameActivity4;
                                    inetAddress = null;
                                    break;
                                }
                                InetAddress[] inetAddressArr = allByName;
                                inetAddress = inetAddressArr[i4];
                                gameActivity = gameActivity4;
                                try {
                                    try {
                                        try {
                                            if (inetAddress instanceof Inet4Address) {
                                                break;
                                            }
                                            i4++;
                                            allByName = inetAddressArr;
                                            gameActivity4 = gameActivity;
                                        } catch (Exception e) {
                                            e = e;
                                            file = file4;
                                            z = false;
                                            file.delete();
                                            ti tiVar = ui.a;
                                            ui.c(ti.i, "GameActivity", "0.3.DL model download failed type=" + i2, e);
                                            boolean z2 = z;
                                            try {
                                                iv2Var.c();
                                                gameActivity.nativeOnDlModelDownloadResult(this.t, this.u, str4, z2, this.w);
                                                return dm3.a;
                                            } catch (CancellationException e2) {
                                                e = e2;
                                                str4 = str4;
                                                gameActivity.nativeOnDlModelDownloadResult(this.t, this.u, str4, false, this.w);
                                                throw e;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str4 = str4;
                                        try {
                                            iv2Var.c();
                                            throw th;
                                        } catch (CancellationException e3) {
                                            e = e3;
                                            gameActivity.nativeOnDlModelDownloadResult(this.t, this.u, str4, false, this.w);
                                            throw e;
                                        }
                                    }
                                } catch (CancellationException e4) {
                                    e = e4;
                                    str4 = str4;
                                    try {
                                        file4.delete();
                                        throw e;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        iv2Var.c();
                                        throw th;
                                    }
                                }
                            }
                            String hostAddress = inetAddress != null ? inetAddress.getHostAddress() : null;
                            if (hostAddress != null) {
                                str3 = hostAddress;
                            }
                        } else {
                            gameActivity = gameActivity4;
                        }
                        url2 = str3.length() > 0 ? new URL(url.getProtocol(), str3, url.getPort(), url.getFile()) : url;
                        parentFile = file3.getParentFile();
                    } catch (CancellationException e5) {
                        e = e5;
                        gameActivity = gameActivity4;
                    } catch (Exception e6) {
                        e = e6;
                        gameActivity = gameActivity4;
                    }
                    try {
                        if (parentFile == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        URLConnection uRLConnectionOpenConnection = url2.openConnection();
                        uRLConnectionOpenConnection.getClass();
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
                        httpURLConnection2.setRequestProperty("User-Agent", "SAMP/0.3");
                        httpURLConnection2.setRequestProperty("Accept", "*/*");
                        httpURLConnection2.setRequestProperty("Accept-Encoding", "identity");
                        if (str3.length() > 0) {
                            if (url.getPort() > 0) {
                                host = url.getHost() + ":" + url.getPort();
                            } else {
                                host = url.getHost();
                            }
                            httpURLConnection2.setRequestProperty("Host", host);
                        }
                        try {
                            httpURLConnection2.setUseCaches(false);
                            httpURLConnection2.setConnectTimeout(15000);
                            httpURLConnection2.setReadTimeout(30000);
                            httpURLConnection2.setInstanceFollowRedirects(true);
                            httpURLConnection2.setRequestMethod("GET");
                            try {
                                int responseCode = httpURLConnection2.getResponseCode();
                                try {
                                    if (200 > responseCode || responseCode >= 300) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    long contentLengthLong = httpURLConnection2.getContentLengthLong();
                                    if (-1 > contentLengthLong || contentLengthLong >= 134215681) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    if (contentLengthLong > 0 && contentLengthLong != i) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String str5 = "Failed requirement.";
                                    if (contentLengthLong <= 0) {
                                        contentLengthLong = i;
                                    }
                                    CRC32 crc32 = new CRC32();
                                    InputStream inputStream = httpURLConnection2.getInputStream();
                                    inputStream.getClass();
                                    httpURLConnection = httpURLConnection2;
                                    try {
                                        BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
                                        try {
                                            try {
                                                long j7 = contentLengthLong;
                                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file4, false), 8192);
                                                try {
                                                    bArr = new byte[8192];
                                                    j3 = 0;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                                while (true) {
                                                    int i5 = bufferedInputStream.read(bArr);
                                                    if (i5 < 0) {
                                                        break;
                                                    }
                                                    File file5 = file3;
                                                    File file6 = file4;
                                                    long j8 = i5;
                                                    long j9 = j3 + j8;
                                                    if (j9 > 134215680) {
                                                        throw new IllegalArgumentException(str5);
                                                    }
                                                    if (j7 > 0) {
                                                        j4 = j8;
                                                        try {
                                                            file2 = file6;
                                                            try {
                                                                gameActivity2.updateDlModelProgress(j, i2, y02.h((int) ((100 * j9) / j7), 0, 99));
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                        }
                                                    } else {
                                                        j4 = j8;
                                                        file2 = file6;
                                                    }
                                                    if (j9 == j4 || j9 % 262144 < j4) {
                                                        gameActivity3 = gameActivity2;
                                                        int i6 = i2;
                                                        long j10 = j;
                                                        try {
                                                            gameActivity3.nativeOnDlModelDownloadProgress(j10, i6, j2);
                                                            j = j10;
                                                            i2 = i6;
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                        }
                                                    } else {
                                                        gameActivity3 = gameActivity2;
                                                    }
                                                    crc32.update(bArr, 0, i5);
                                                    bufferedOutputStream.write(bArr, 0, i5);
                                                    gameActivity2 = gameActivity3;
                                                    file3 = file5;
                                                    j3 = j9;
                                                    file4 = file2;
                                                    th = th5;
                                                    th = th;
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th8) {
                                                        try {
                                                            uq.l(bufferedOutputStream, th);
                                                            throw th8;
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            Throwable th10 = th;
                                                            try {
                                                                throw th10;
                                                            } catch (Throwable th11) {
                                                                uq.l(bufferedInputStream, th10);
                                                                throw th11;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th12) {
                                                th = th12;
                                            }
                                        } catch (Throwable th13) {
                                            th = th13;
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        httpURLConnection.disconnect();
                                        throw th;
                                    }
                                } catch (Throwable th15) {
                                    th = th15;
                                    httpURLConnection.disconnect();
                                    throw th;
                                }
                            } catch (Throwable th16) {
                                th = th16;
                                httpURLConnection = httpURLConnection2;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            z = false;
                            file = file4;
                            file.delete();
                            ti tiVar2 = ui.a;
                            ui.c(ti.i, "GameActivity", "0.3.DL model download failed type=" + i2, e);
                            boolean z22 = z;
                            iv2Var.c();
                            gameActivity.nativeOnDlModelDownloadResult(this.t, this.u, str4, z22, this.w);
                            return dm3.a;
                        }
                    } catch (CancellationException e8) {
                        e = e8;
                        str4 = str4;
                        file4.delete();
                        throw e;
                    } catch (Exception e9) {
                        e = e9;
                    }
                } catch (Throwable th17) {
                    th = th17;
                    gameActivity = gameActivity4;
                }
            } catch (Throwable th18) {
                th = th18;
                gameActivity = gameActivity4;
            }
        } catch (CancellationException e10) {
            e = e10;
            gameActivity = gameActivity4;
        }
    }
}
