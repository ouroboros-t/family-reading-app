package com.techelevator.dao;

import com.techelevator.model.Family;

public interface FamilyDao {

    // what do we need in here?
    // addFamily, updateFamily, deleteFamily

    void addFamily(Family familyToAdd);

    void updateFamily(Family updatedFamily);

    void deleteFamily(Long familyId);

}