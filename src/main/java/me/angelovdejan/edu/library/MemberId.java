package me.angelovdejan.edu.library;

import java.util.UUID;

public final class MemberId {

    private String id;

    private MemberId() {}

    private MemberId(String id) {
        this.id = id;
    }

    public static MemberId fromString(String id) {
        return new MemberId(id);
    }

    public static MemberId create() {
        return MemberId.fromString(UUID.randomUUID().toString());
    }

    public boolean equals(MemberId memberId) {
        return memberId.id.equals(this.id);
    }
}
