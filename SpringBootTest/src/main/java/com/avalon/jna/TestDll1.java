package com.avalon.jna;


import com.sun.jna.Library;
import com.sun.jna.Native;


/**
 * @Author ouyqy
 * @date 2017/11/21 9:26
 */
public interface TestDll1 extends Library {
//
//    public class UserStruct extends Structure{
//        @Override
//        protected List getFieldOrder() {
//            return null;
//        }
//
//        public static class ByReference extends UserStruct implements Structure.ByReference{}
//        public static class ByValue extends UserStruct implements Structure.ByValue{}
//        public NativeLong id;
//        public WString name;
//        public int age;
//    }
//
//    public  class CompanyStruct extends Structure{
//        public static  class ByReference extends CompanyStruct implements Structure.ByReference{};
//        public static  class ByValue extends CompanyStruct implements Structure.ByValue{};
//        public NativeLong id;
//        public WString name;
//        //public Pointer[] users=new Pointer[100];
//        //需要使用toArray，因为java中的内存空间是不连续的，所以使用JNA提供的toArray方法生成连续的内存空间
//        public UserStruct.ByReference[] users=(UserStruct.ByReference[]) new UserStruct.ByReference() {
//        }.toArray(100);
//        public int count;
//    }

    TestDll1 INSTANCE = (TestDll1) Native.loadLibrary("JNATest",TestDll1.class);
//    public void sayUser(UserStruct userStruct);
//    public void sayCompany(CompanyStruct companyStruct);
    public void say(char value);
}
