package com.mamallan.gwtapp.client;

import java.util.ArrayList;
import java.util.TreeMap;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.mamallan.gwtapp.shared.dto.AddedBeanDTO;
import com.mamallan.gwtapp.shared.dto.AnnotationsDTO;
import com.mamallan.gwtapp.shared.dto.BeanObjectDTO;
import com.mamallan.gwtapp.shared.dto.BindingsDTO;
import com.mamallan.gwtapp.shared.entity.GlobalPreferencesEntity;
import com.mamallan.gwtapp.shared.entity.MyAccountEntity;
import com.mamallan.gwtapp.shared.entity.NameSpaceEntity;
import com.mamallan.gwtapp.shared.entity.UserEntity;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface HelloService extends RemoteService {
	String greetServer(String name) throws IllegalArgumentException;
	String addUser(UserEntity user) throws Exception;
	boolean verifyCaptcha(String challenge, String response)throws Exception;
	boolean verifySubscription(String email) throws Exception;
	UserEntity signIn(String userName, String password) throws Exception;
	String editUser(UserEntity user) throws Exception;
	ArrayList<String> readUploadedFiles() throws Exception;
	String fetchLogo() throws Exception;
	GlobalPreferencesEntity fetchGlobalPreferences() throws Exception;
	String updateGlobalPreferences(GlobalPreferencesEntity globalPreferencesEntity) throws Exception;
	String updateMyAccount (MyAccountEntity myAccountEntity)throws Exception;
	String logOut() throws Exception;
	String fetchUserStatus(String userName, String email) throws Exception;
	String inactivateAccount(String userName) throws Exception;
	String sendActivationEmailForgotPassword(String userName) throws Exception;
	boolean isLoggedInWithin20Mins(UserEntity user) throws Exception;
	UserEntity fetchNewUser(String createPasswordToken)throws Exception;
	String updatePassword(UserEntity user)throws Exception;
	String emailUserName(String email)throws Exception;
	ArrayList<UserEntity>fetchAllUsers()throws Exception;
	String updateUserAccount(UserEntity user)throws Exception;
	String closeAccount(UserEntity user) throws Exception;
	String fetchBeanJSON(String className, String reflectionName, String action) throws Exception;
	String generateJavaBean(AddedBeanDTO addedBeanDTO)throws Exception;
	String generateDynamicBean(AddedBeanDTO addedBeanDTO)throws Exception;
	ArrayList<String> fetchPackages()throws Exception;
	ArrayList<String> fetchClassesOfAllPackages()throws Exception;
	ArrayList<String> fetchStringClassesOfAllPackages()throws Exception;
	ArrayList<AnnotationsDTO>fetchAnnotations()throws Exception;
	String loadUploadedClass (String className)throws Exception;
	String editBeanOnPropertyChange(String selectedBeanName, TreeMap beanPropertiesMap) throws Exception;
	String editDynamicBeanOnPropertyChange(String selectedBeanName, TreeMap beanPropertiesMap) throws Exception;
	String fetchBeanObject(String beanName)throws Exception;
	String downloadBeanFieldsJson(String beanName) throws Exception;
	String loadBeansJsonAndCreateDynamicBeans()throws Exception;
	ArrayList<BeanObjectDTO> fetchAllBeansInDb()throws Exception;
	ArrayList<BindingsDTO> fetchAllBindings(String keyword)throws Exception;
	String saveBinding(BindingsDTO binding) throws Exception;
	String deleteBinding(int bindingId) throws Exception;
	String deleteMultipleBindings(ArrayList<Integer> bndingIds) throws Exception;
	ArrayList<NameSpaceEntity>fetchNameSpaces()throws Exception;
	
	
}
