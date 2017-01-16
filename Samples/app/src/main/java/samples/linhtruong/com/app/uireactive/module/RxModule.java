package samples.linhtruong.com.app.uireactive.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import samples.linhtruong.com.app.uireactive.manager.ResManager;
import samples.linhtruong.com.app.uireactive.manager.RxDbManager;
import samples.linhtruong.com.app.uireactive.task.TaskManager;
import samples.linhtruong.com.app.uireactive.task.TaskResource;
import samples.linhtruong.com.utils.ScreenUtils;

/**
 * Created by Truong on 9/26/16 - 17:28.
 * Description:
 */

@Module
public class RxModule {

    private final Application mApplication;

    public RxModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    RxDbManager provideDbManager() {
        return new RxDbManager(mApplication);
    }

    @Provides
    @Singleton
    ResManager provideResManager() {
        return new ResManager(mApplication);
    }

    @Provides
    @Singleton
    TaskResource provideTaskResource() {
        return new TaskResource();
    }

    @Provides
    @Singleton
    TaskManager provideTaskManager() {
        return new TaskManager();
    }
}