package in.anand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.anand.Dao.*;
import in.anand.util.*;

@Service
public class UserService {
	
	private userDao usedao;
	private EmailUtil emailutil;
	private PwdUtil pwduttil;
	
	public UserService() {
System.out.println("userservice constructor");
	}
	
	@Autowired
	public void setUsedao(userDao usedao) {
		this.usedao = usedao;
	}
	@Autowired
	public void setEmailutil(EmailUtil emailutil) {
		this.emailutil = emailutil;
	}
	
	@Autowired
	public void setPwduttil(PwdUtil pwduttil) {
		this.pwduttil = pwduttil;
	}
	
	
	public void register()
	{
		pwduttil.pwdencrypt();
		usedao.userSaved();
		emailutil.sendemail();
		System.out.println("registeration successfull");
	}
	
	
	

	
	
	
}
