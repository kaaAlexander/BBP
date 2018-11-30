package by.tut.kaa.alexander.bbp.deal.service.util;

import by.tut.kaa.alexander.bbp.deal.repository.model.Deal;
import by.tut.kaa.alexander.bbp.deal.service.modelDTO.DealDTO;
import org.springframework.stereotype.Component;

@Component
public class DealConverter {

    public Deal convert(DealDTO dealDTO) {
        Deal deal = new Deal();
        deal.setDealId(dealDTO.getDealId());
        deal.setCountryExport(dealDTO.getCountryExport());
        deal.setCountryImport(dealDTO.getCountryImport());
        deal.setDealBalance(dealDTO.getDealBalance());
        deal.setDealName(dealDTO.getDealName());
        return deal;
    }

    public DealDTO convert(Deal deal) {
        DealDTO dealDTO = new DealDTO();
        dealDTO.setDealId(deal.getDealId());
        dealDTO.setCountryExport(deal.getCountryExport());
        dealDTO.setCountryImport(deal.getCountryImport());
        dealDTO.setDealBalance(deal.getDealBalance());
        dealDTO.setDealName(deal.getDealName());
        return dealDTO;
    }
}
