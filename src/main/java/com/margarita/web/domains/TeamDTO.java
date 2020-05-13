package com.margarita.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TeamDTO {
    private String teamId, stadiumId, regionName, teamName, eTeamName, origYyyy, zipCode1, zipCode2, address, ddd, tel, fax,homePage, owner;
}
