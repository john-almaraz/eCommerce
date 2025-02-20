package com.john_almaraz.auth_service.application.port.input;

import com.john_almaraz.auth_service.application.command.AddDocumentCommand;
import com.john_almaraz.auth_service.application.command.AddCreditCardCommand;
import com.john_almaraz.auth_service.application.command.AddPermissionCommand;
import com.john_almaraz.auth_service.application.command.ApproveSellerCommand;
import com.john_almaraz.auth_service.application.command.BuyCommand;
import com.john_almaraz.auth_service.application.command.ChangePasswordCommand;
import com.john_almaraz.auth_service.application.command.DeleteBookCommand;
import com.john_almaraz.auth_service.application.command.DeleteUserCommand;
import com.john_almaraz.auth_service.application.command.GetBookByIdCommand;
import com.john_almaraz.auth_service.application.command.GetCatalogCommand;
import com.john_almaraz.auth_service.application.command.GetDocumentByIdCommand;
import com.john_almaraz.auth_service.application.command.GetDocumentsCommand;
import com.john_almaraz.auth_service.application.command.GetCreditCardByIdCommand;
import com.john_almaraz.auth_service.application.command.GetCreditCardsCommand;
import com.john_almaraz.auth_service.application.command.GetPermissionsCommand;
import com.john_almaraz.auth_service.application.command.GetPurchaseHistoryCommand;
import com.john_almaraz.auth_service.application.command.GetUserByIdCommand;
import com.john_almaraz.auth_service.application.command.LoginUserCommand;
import com.john_almaraz.auth_service.application.command.LogoutCommand;
import com.john_almaraz.auth_service.application.command.RemoveDocumentCommand;
import com.john_almaraz.auth_service.application.command.ResetPasswordCommand;
import com.john_almaraz.auth_service.application.command.ResetPasswordRequestCommand;
import com.john_almaraz.auth_service.application.command.UpdateBookCommand;
import com.john_almaraz.auth_service.application.command.ActiveUserCommand;
import com.john_almaraz.auth_service.application.command.PublishBookCommand;
import com.john_almaraz.auth_service.application.command.RegisterUserCommand;
import com.john_almaraz.auth_service.application.command.RemoveCreditCardCommand;
import com.john_almaraz.auth_service.application.command.RemovePermissionCommand;
import com.john_almaraz.auth_service.application.command.SuspendUserCommand;
import com.john_almaraz.auth_service.application.command.UpdateDocumentCommand;
import com.john_almaraz.auth_service.application.command.UpdateCreditCardCommand;
import com.john_almaraz.auth_service.application.command.UpdateUserProfileCommand;
import com.john_almaraz.auth_service.application.dto.AuthResponseDTO;
import com.john_almaraz.auth_service.application.dto.BookSummaryDTO;
import com.john_almaraz.auth_service.application.dto.DocumentDTO;
import com.john_almaraz.auth_service.application.dto.OrderSummaryDTO;
import com.john_almaraz.auth_service.application.dto.CreditCardDTO;
import com.john_almaraz.auth_service.application.dto.PermissionDTO;
import com.john_almaraz.auth_service.application.dto.UserDTO;

import java.util.List;

public interface UserService {
    AuthResponseDTO login(LoginUserCommand loginCommand);
    UserDTO register(RegisterUserCommand registerUserCommand);
    Boolean changePassword(ChangePasswordCommand changePasswordCommand);
    Boolean resetPasswordRequest(ResetPasswordRequestCommand resetPasswordRequestCommand);
    Boolean resetPassword(ResetPasswordCommand resetPasswordCommand);
    Boolean logout(LogoutCommand logoutCommand);

    UserDTO updateUserProfile(UpdateUserProfileCommand updateUserProfileCommand);
    UserDTO getUserById(GetUserByIdCommand getUserByIdCommand);

    BookSummaryDTO publishBook(PublishBookCommand publishBookCommand);
    BookSummaryDTO updateBook(UpdateBookCommand updateBookCommand);
    BookSummaryDTO deleteBook(DeleteBookCommand deleteBookCommand);
    List<BookSummaryDTO> getCatalog(GetCatalogCommand getCatalogCommand);
    BookSummaryDTO getBookById(GetBookByIdCommand getBookByIdCommand);

    DocumentDTO addDocument(AddDocumentCommand addDocumentCommand);
    DocumentDTO updateDocument(UpdateDocumentCommand updateDocumentCommand);
    DocumentDTO removeDocument(RemoveDocumentCommand removeDocumentCommand);
    List<DocumentDTO> getDocuments(GetDocumentsCommand getDocumentsCommand);
    DocumentDTO getDocumentById(GetDocumentByIdCommand getDocumentByIdCommand);

    OrderSummaryDTO buy(BuyCommand buyCommand);
    List<OrderSummaryDTO> getPurchaseHistory(GetPurchaseHistoryCommand getPurchaseHistoryCommand);

    CreditCardDTO addCreditCard(AddCreditCardCommand addCreditCardCommand);
    CreditCardDTO updateCreditCard(UpdateCreditCardCommand updateCreditCardCommand);
    CreditCardDTO removeCreditCard(RemoveCreditCardCommand removeCreditCardCommand);
    List <CreditCardDTO> getCreditCard(GetCreditCardsCommand getCreditCardsCommand);
    CreditCardDTO getCreditCardById(GetCreditCardByIdCommand getCreditCardByIdCommand);

    Boolean addPermission(AddPermissionCommand addPermissionCommand);
    Boolean removePermission(RemovePermissionCommand removePermissionCommand);
    List<PermissionDTO> getPermissions(GetPermissionsCommand getPermissionsCommand);

    UserDTO activeUser(ActiveUserCommand activeUserCommand);
    UserDTO suspendUser(SuspendUserCommand suspendUserCommand);
    UserDTO deleteUser(DeleteUserCommand deleteUserCommand);
    Boolean approveSeller(ApproveSellerCommand approveSellerCommand);

}
