package defpackage;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xs implements CharacterIterator {
    public final CharSequence f;
    public final int g;
    public int h = 0;

    public xs(CharSequence charSequence, int i) {
        this.f = charSequence;
        this.g = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.h;
        if (i == this.g) {
            return (char) 65535;
        }
        return this.f.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.h = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.g;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.h;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.g;
        if (i == 0) {
            this.h = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.h = i2;
        return this.f.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.h + 1;
        this.h = i;
        int i2 = this.g;
        if (i < i2) {
            return this.f.charAt(i);
        }
        this.h = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.h;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.h = i2;
        return this.f.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.g || i < 0) {
            c.p("invalid position");
            return (char) 0;
        }
        this.h = i;
        return current();
    }
}
