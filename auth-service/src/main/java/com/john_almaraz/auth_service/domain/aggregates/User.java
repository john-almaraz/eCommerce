package com.john_almaraz.auth_service.domain.aggregates;

import com.john_almaraz.auth_service.domain.enums.Role;
import com.john_almaraz.auth_service.domain.enums.UserStatus;
import com.john_almaraz.auth_service.domain.model.BookSummary;
import com.john_almaraz.auth_service.domain.model.CreditCard;
import com.john_almaraz.auth_service.domain.model.Document;
import com.john_almaraz.auth_service.domain.model.OrderSummary;
import com.john_almaraz.auth_service.domain.model.Permission;
import com.john_almaraz.auth_service.domain.valueObjects.Password;
import com.john_almaraz.auth_service.domain.valueObjects.Email;
import com.john_almaraz.auth_service.domain.valueObjects.FullName;
import com.john_almaraz.auth_service.domain.valueObjects.ID;
import lombok.Data;

import java.util.List;

@Data
public class User {

    private ID id;
    private FullName fullName;
    private Email email;
    private Password password;
    private Role role ;
    private UserStatus userStatus;

    private List<OrderSummary> purchaseHistory;
    private ID shoppingCartID;
    private List<CreditCard> creditCardList;

    private List<BookSummary> catalog;
    private List<Document> documents;

    private List<Permission> permissions;

}
