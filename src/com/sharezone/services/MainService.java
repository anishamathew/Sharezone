package com.sharezone.services;

import java.util.ArrayList;

import com.sharezone.bean.OrderDetailsBean;
import com.sharezone.bean.SignUpBean;
import com.sharezone.bean.WorkspaceDetailsBean;

import com.sharezone.vo.WorkspaceVo;

public interface MainService {

	


	String setSignUp(SignUpBean signup);




	String setWorkspaceDetails(WorkspaceDetailsBean workspaceDetails);




	String setlogin(SignUpBean sess);




	ArrayList<WorkspaceVo> getWorkspaceList();




	ArrayList<SignUpBean> getManagerList();




	ArrayList<SignUpBean> getManagers();




	ArrayList<WorkspaceDetailsBean> getWorkspaceListForManager(Integer id);




	String setOrder(OrderDetailsBean obj);




	











}
