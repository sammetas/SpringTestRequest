package com.example.SpringTestRequest;

import com.google.common.collect.Sets;

import java.util.Set;

public enum ApplicationUserRoles {
    STUDENT(Sets.newHashSet()),
    ADMINTRAINEE(Sets.newHashSet(AppUserPermission.COURSE_READ,AppUserPermission.STUDENT_READ)),
    ADMIN(Sets.newHashSet(AppUserPermission.COURSE_READ,AppUserPermission.COURSE_WRITE,AppUserPermission.STUDENT_READ,AppUserPermission.STUDENT_WRITE));

    private final Set<AppUserPermission> permissions;

    ApplicationUserRoles(Set<AppUserPermission> permissions){
        this.permissions=permissions;
    }

    public Set<AppUserPermission> getPermission(){
        return  permissions;
    }

}
