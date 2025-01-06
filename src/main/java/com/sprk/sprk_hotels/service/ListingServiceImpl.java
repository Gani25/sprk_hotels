package com.sprk.sprk_hotels.service;

import com.sprk.sprk_hotels.model.Listing;
import com.sprk.sprk_hotels.repository.ListingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ListingServiceImpl implements ListingService{

    private ListingRepository listingRepository;

    @Override
    public Listing saveListing(Listing listing) {
        Listing savedListing = listingRepository.save(listing);
        return savedListing;
    }
}