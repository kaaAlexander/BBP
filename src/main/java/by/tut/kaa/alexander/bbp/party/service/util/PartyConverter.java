package by.tut.kaa.alexander.bbp.party.service.util;

import by.tut.kaa.alexander.bbp.party.repository.model.Party;
import by.tut.kaa.alexander.bbp.party.service.modelDTO.PartyDTO;
import org.springframework.stereotype.Component;

@Component
public class PartyConverter {

    public Party convert(PartyDTO partyDTO) {
        Party party = new Party();
        party.setPartyId(partyDTO.getPartyId());
        party.setRole(partyDTO.getRole());
        return party;
    }

    public PartyDTO convert(Party party) {
        PartyDTO partyDTO = new PartyDTO();
        partyDTO.setPartyId(party.getPartyId());
        partyDTO.setRole(party.getRole());
        partyDTO.setDealId(party.getDeal().getDealId());
        partyDTO.setUserId(party.getUser().getUserId());
        return partyDTO;
    }
}
