package com.kennie.common.router;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * project : AndroidLibraryTemplate
 * class_name :  RouterUtils
 * author : Kennie
 * date : 2022/4/26 23:59
 * desc : ARouter路由管理工具类
 */
public class RouterUtils {

    public static void inject(Object obj) {
        ARouter.getInstance().inject(obj);
    }

    public static void navigation(String path) {
        ARouter.getInstance().build(path).navigation();
    }

    public static <T> T build(String path) {
        return (T) ARouter.getInstance().build(path).navigation();
    }
}
