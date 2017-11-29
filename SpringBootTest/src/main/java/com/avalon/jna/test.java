package com.avalon.jna;

/**
 * @Author ouyqy
 * @date 2017/11/21 11:00
 */
public class test {
    public static void main (String[] args){
//        TestDll1.UserStruct.ByReference userStruct = new TestDll1.UserStruct.ByReference();
//        userStruct.id=new NativeLong(100);
//        userStruct.age=30;
//        userStruct.name=new WString("avalon");
//        TestDll1.INSTANCE.sayUser(userStruct);
//
//        TestDll1.CompanyStruct.ByReference companyStruct = new TestDll1.CompanyStruct.ByReference();
//        companyStruct.id = new NativeLong(2);
//        companyStruct.name = new WString("hehe");
//        companyStruct.count=10;
//        TestDll1.UserStruct.ByReference reference = new TestDll1.UserStruct.ByReference();
//        reference.id = new NativeLong(90);
//        reference.age=99;
//        reference.name=new WString("ouyqy");
//        for(int i=0;i<companyStruct.count;i++){
//            companyStruct.users[i]=reference;
//        }
//        TestDll1.INSTANCE.sayCompany(companyStruct);
        TestDll1.INSTANCE.say('1');
    }
}
