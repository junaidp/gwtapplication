package com.mamallan.gwtapp.client;

import java.util.ArrayList;
import java.util.TreeMap;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.mamallan.gwtapp.shared.dto.AddedBeanDTO;
import com.mamallan.gwtapp.shared.dto.AnnotationsDTO;
import com.mamallan.gwtapp.shared.dto.BeanObjectDTO;
import com.mamallan.gwtapp.shared.entity.BeanObjects;
import com.mamallan.gwtapp.shared.entity.BindingsEntity;
import com.mamallan.gwtapp.shared.entity.GlobalPreferencesEntity;
import com.mamallan.gwtapp.shared.entity.MyAccountEntity;
import com.mamallan.gwtapp.shared.entity.UserEntity;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface HelloServiceAsync {
	void greetServer(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
	void addUser(UserEntity user, AsyncCallback<String> callback);
	void verifyCaptcha(String challenge, String response, AsyncCallback<Boolean> callback);
	void verifySubscription(String email, AsyncCallback<Boolean> callback);
	void signIn(String userName, String password, AsyncCallback<UserEntity> callback);
	void editUser(UserEntity user, AsyncCallback<String> callback);
	void readUploadedFiles( AsyncCallback<ArrayList<String>> callback);
	void fetchLogo(AsyncCallback<String> callback);
	void fetchGlobalPreferences(AsyncCallback<GlobalPreferencesEntity> callback);
	void updateGlobalPreferences(GlobalPreferencesEntity globalPreferencesEntity, AsyncCallback<String> callback);
	void updateMyAccount(MyAccountEntity myAccountEntity, AsyncCallback<String> callback);
	void logOut(AsyncCallback<String> callback);
	void fetchUserStatus(String userName, String email, AsyncCallback<String> callback);
	void inactivateAccount (String userName, AsyncCallback<String> callback);
	void sendActivationEmailForgotPassword(String userName,AsyncCallback<String> callback);
	void isLoggedInWithin20Mins(UserEntity user,AsyncCallback<Boolean> asyncCallback);
	void fetchNewUser(String createPasswordToken, AsyncCallback<UserEntity> asyncCallback);
	void updatePassword(UserEntity user, AsyncCallback<String> asyncCallback);
	void emailUserName(String email, AsyncCallback<String> asyncCallback);
	void fetchAllUsers(AsyncCallback<ArrayList<UserEntity>> asyncCallback);
	void updateUserAccount(UserEntity user, AsyncCallback<String> asyncCallback);
	void closeAccount(UserEntity user, AsyncCallback<String> asyncCallback);
	void fetchBeanJSON(String className, String reflectionName, String action, AsyncCallback<String> asyncCallback);
	void generateJavaBean(AddedBeanDTO addedBeanDTO, AsyncCallback<String> asyncCallback);
	void generateDynamicBean(AddedBeanDTO addedBeanDTO, AsyncCallback<String> asyncCallback);
	void fetchPackages(AsyncCallback<ArrayList<String>> asyncCallback);
	void fetchClassesOfAllPackages(AsyncCallback<ArrayList<String>> asyncCallback);
	void fetchStringClassesOfAllPackages(AsyncCallback<ArrayList<String>> asyncCallback);
	void fetchAnnotations(AsyncCallback<ArrayList<AnnotationsDTO>> asyncCallback);
	void loadUploadedClass(String className, AsyncCallback<String> asyncCallback);
	void editBeanOnPropertyChange(String selectedBeanName, TreeMap beanPropertiesMap, AsyncCallback<String> asyncCallback);
	void editDynamicBeanOnPropertyChange(String selectedBeanName, TreeMap beanPropertiesMap, AsyncCallback<String> asyncCallback);
	void fetchBeanObject(String beanName, AsyncCallback<String> asyncCallback);
	void downloadBeanFieldsJson(String beanName, AsyncCallback<String> asyncCallback);
	void loadBeansJsonAndCreateDynamicBeans(AsyncCallback<String> asyncCallback);
	void fetchAllBeansInDb(AsyncCallback<ArrayList<BeanObjectDTO>> asyncCallback);
	void fetchAllBindings(AsyncCallback<ArrayList<BindingsEntity>> asyncCallback);
	void saveBinding(BindingsEntity binding, AsyncCallback<String> asyncCallback);
	void deleteBinding(int bindingId,  AsyncCallback<String> asyncCallback);
	void deleteMultipleBindings(ArrayList<Integer> bindingIds, AsyncCallback<String> asyncCallback);
}
