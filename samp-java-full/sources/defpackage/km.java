package defpackage;

import android.widget.Toast;
import top.th1nk.samp.R;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class km extends mb3 implements rs0 {
    public final /* synthetic */ int j = 0;
    public /* synthetic */ boolean k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km(GameActivity gameActivity, boolean z, p40 p40Var) {
        super(2, p40Var);
        this.l = gameActivity;
        this.k = z;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((km) m((p40) obj2, bool)).o(dm3Var);
                break;
            default:
                ((km) m((p40) obj2, (x50) obj)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                km kmVar = new km((jj3) obj2, p40Var);
                kmVar.k = ((Boolean) obj).booleanValue();
                return kmVar;
            default:
                return new km((GameActivity) obj2, this.k, p40Var);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                y02.Q(obj);
                if (!this.k) {
                    ((jj3) obj2).a();
                }
                break;
            default:
                y02.Q(obj);
                GameActivity gameActivity = (GameActivity) obj2;
                Toast.makeText(gameActivity, gameActivity.getString(this.k ? R.string.game_cleo_import_success : R.string.game_cleo_import_failed), 0).show();
                break;
        }
        return dm3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km(jj3 jj3Var, p40 p40Var) {
        super(2, p40Var);
        this.l = jj3Var;
    }
}
