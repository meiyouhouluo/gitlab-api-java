/**
 * @author shangdu
 * @version 1.0
 * @date 2020/3/30 11:00
 */

import com.css.gitapi.util.controller.UserController;
import com.css.gitapi.util.model.GitLabUser;
import com.css.gitapi.util.enums.Identify;
import org.junit.Test;


public class TestUsers {
    UserController userController = new UserController();

    @Test
    public void testGetAllUserByAdministrator() throws Exception {
        System.out.println(userController.getAllUser(Identify.ADMINISTRATOR));
    }

    @Test
    public void testGetAllUserByRegularAccount() throws Exception {
        System.out.println(userController.getAllUser(Identify.REGUALRACCOUNT));
    }

    @Test
    public void testAddUser() throws Exception {
        GitLabUser gitLabUser = new GitLabUser("测试2", "test2", "test999@css.com.cn", "12345678");
        gitLabUser.setLinkedin("www.baidu.com");
        System.out.println(userController.addUser(gitLabUser));
    }

    @Test
    public void testDelUser() throws Exception {
        System.out.println(userController.delUserById("20"));
    }

    @Test
    public void testModUser() throws Exception {
        GitLabUser gitLabUser = new GitLabUser("测试66611", "test8888", "test1010@css.com.cn", null);
        gitLabUser.setLinkedin("www.sina.com");
        System.out.println(userController.modifyUserById(gitLabUser, "21"));
    }


    @Test
    public void testDeleteAuthenticationIdentityFromUser() throws Exception {
        System.out.println(userController.deleteAuthenticationIdentityFromUser("19", "root"));
    }
}