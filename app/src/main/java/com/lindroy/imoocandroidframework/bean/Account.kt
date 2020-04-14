package com.lindroy.imoocandroidframework.bean

/**
 * @author Lin
 * @date 2020/2/27
 * @function 账号信息实体类
 */
data class Account(val name: String,var level: Int)


//Kotlin如何添加notifyPropertyChanged，实现属性改变时刷新数据呢？
/*class Account constructor():BaseObservable(){
    constructor(name:String,level:Int):this{
        this.name = name
        this.level = level
    }
    var name:String = ""

    @Bindable
    var level:Int = 0
    set(value) {
        field = value
        notifyPropertyChanged(BR.level)
    }
}*/

