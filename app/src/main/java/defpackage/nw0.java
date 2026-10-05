package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nw0 extends br {
    public final BreakIterator k;

    public nw0(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.k = characterInstance;
    }

    @Override // defpackage.br
    public final int I(int i) {
        return this.k.following(i);
    }

    @Override // defpackage.br
    public final int J(int i) {
        return this.k.preceding(i);
    }
}
