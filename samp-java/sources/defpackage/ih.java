package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class ih {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        z30 yl1Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                yl1Var = new yl1(clipData, 3);
            } else {
                a40 a40Var = new a40();
                a40Var.g = clipData;
                a40Var.h = 3;
                yl1Var = a40Var;
            }
            mq3.g(textView, yl1Var.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        z30 yl1Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            yl1Var = new yl1(clipData, 3);
        } else {
            a40 a40Var = new a40();
            a40Var.g = clipData;
            a40Var.h = 3;
            yl1Var = a40Var;
        }
        mq3.g(view, yl1Var.build());
        return true;
    }
}
