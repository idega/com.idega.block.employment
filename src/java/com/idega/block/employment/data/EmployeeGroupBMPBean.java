package com.idega.block.employment.data;

import com.idega.core.data.GenericGroup;
import java.sql.SQLException;

/**
 * Title:        IW Travel Booking
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:      idega.is
 * @author 2000 - idega team - <a href="mailto:gummi@idega.is">Gu�mundur �g�st S�mundsson</a>
 * @version 1.0
 */

public class EmployeeGroupBMPBean extends com.idega.core.data.GenericGroupBMPBean implements com.idega.block.employment.data.EmployeeGroup {
//public class EmployeeGroupBMPBean extends com.idega.user.data.GroupBMPBean implements com.idega.block.employment.data.EmployeeGroup {

  /*public EmployeeGroupBMPBean() {
    super();
  }

  public EmployeeGroupBMPBean(int id) throws SQLException {
    super(id);
  }*/


  public String getGroupTypeValue() {
    return "ep_employee";
  }


  public static String getClassName(){
    return EmployeeGroup.class.getName();
  }


} // EmployeeGroup
