package study.datajpa.dto;

import lombok.Data;

@Data   // 단순 DTO 이기 때문에 Getter / Setter 가 다 들어가 있는 @Data 어노테이션을 붙여줌 - 엔티티에는 왠만하면 적지 말기

public class MemberDto {

    private Long id;    // member 의 id
    private String username;    // member 의 username
    private String teamName;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }
}
