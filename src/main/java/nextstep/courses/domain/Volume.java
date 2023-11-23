package nextstep.courses.domain;

import nextstep.courses.CannotVolumeOver1MBException;

public class Volume {

    private static final long MAX_SIZE = 1048576L;
    private final long volumeSize;

    public Volume(long volumeSize) {
        if (volumeSize > MAX_SIZE) {
            throw new CannotVolumeOver1MBException("파일 크기는 1MB 이하여야 합니다.");
        }

        this.volumeSize = volumeSize;
    }
}
