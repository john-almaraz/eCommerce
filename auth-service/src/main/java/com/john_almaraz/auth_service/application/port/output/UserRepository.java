package com.john_almaraz.auth_service.application.port.output;

import com.john_almaraz.auth_service.domain.aggregates.User;
import com.john_almaraz.auth_service.domain.model.CreditCard;
import com.john_almaraz.auth_service.domain.model.Permission;
import com.john_almaraz.auth_service.domain.valueObjects.ID;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User register(User user);
    Boolean changePassword(String currentPassword, String newPassword);
    Boolean resetPasswordRequest(String email);
    Boolean resetPassword(String token, String newPassword);

    User updateUserProfile(ID userID, User user);
    Optional<User> getUserById(ID userID);

    CreditCard addCreditCard(ID sellerID, CreditCard creditCard);
    CreditCard updateCreditCard(ID sellerID, ID creditCardID, CreditCard creditCard);
    CreditCard removeCreditCard(ID sellerID, ID creditCardID);
    List <CreditCard> getCreditCards(ID sellerID);
    CreditCard getCreditCardById(ID sellerID, ID creditCardID);

    Boolean addPermission(ID adminID, Permission permission);
    Boolean removePermission(ID adminID,ID permissionID);
    List<Permission> getPermissions(ID adminID);

    User activeUser(ID adminID, ID userID);
    User suspendUser(ID adminID, ID userID);
    User deleteUser(ID adminID, ID userID);
    Boolean approveSeller(ID adminID, ID sellerID);
}
