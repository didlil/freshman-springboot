<template>
  <div style="height: 100vh; position: relative; background-color: aliceblue">
    <el-container>
      <!--      侧边栏-->
      <el-aside :width="asideWidth" style="min-height: 100vh; background-color: #001529">
        <div style="height: 60px; color: white; display: flex; align-items: center; justify-content: center">
          <img src="@/assets/logo1.png" alt="" style="width: 40px; height: 40px">
          <span class="logo-title" v-show="!isCollapse">R1024</span>
        </div>

        <el-menu :collapse="isCollapse" :collapse-transition="false" router background-color="#001529" text-color="rgba(255,255,255,0.65)" active-text-color="#fff"
                 style="border: none" :default-active="$route.path">
          <el-menu-item index="/">
            <i class="el-icon-house"></i>
            <span slot="title">系统首页</span>
          </el-menu-item>
          <el-menu-item index="/1">
            <template slot="title">
              <i class="el-icon-house"></i>
              <span>系统首页</span>
            </template>
          </el-menu-item>
          <el-menu-item index="/2">
            <template slot="title">
              <i class="el-icon-house"></i>
              <span>系统首页</span>
            </template>
          </el-menu-item>
          <el-submenu>
            <template slot="title">
              <i class="el-icon-menu"></i>
              <span>信息管理</span>
            </template>
            <el-menu-item>用户信息</el-menu-item>
            <el-menu-item>管理员信息</el-menu-item>
          </el-submenu>
        </el-menu>

      </el-aside>

      <el-container>
        <!-- 头部区域-->
        <el-header>
          <i class="el-icon-menu" style="font-size: 24px" @click="handleCollapse" ></i>

                   <el-breadcrumb separator-class="el-icon-arrow-right" style="margin-left: 20px">
                      <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
                      <el-breadcrumb-item :to="{ path: '/user' }">用户管理</el-breadcrumb-item>
                    </el-breadcrumb>
          <div style="flex: 1; width:0; display: flex; align-items: center; justify-content: flex-end">
            <el-dropdown placement="bottom-end" popper-class="my-dropdown">
              <div style="display: flex; align-items: center; cursor: default">
                <img src="@/assets/logo1.png" alt="" style="width: 40px; height: 40px">
                <span>管理员</span>
              </div>
              <el-dropdown-menu slot="dropdown">
              <el-dropdown-item>個人情報</el-dropdown-item>
              <el-dropdown-item>パスワードを設定する</el-dropdown-item>
              <el-dropdown-item @click.native="$router.push('/login')">ログアウト</el-dropdown-item>
              </el-dropdown-menu>
            </el-dropdown>
          </div>

        </el-header>

        <el-main>
          <div style="box-shadow: 0 0 10px rgba(0,0,0,.1); padding: 10px 20px; border-radius: 5px; margin-bottom: 10px">
            おはよう！お元気ですか？
          </div>
          <el-card style="width: 500px">
            <div slot-scope="header" class="clearfix">
              <span>今日も幸せな一日になりますように</span>
            </div>
            <div>
              頑張って生きてくれよ！
            </div>
            <div style="margin-top: 20px">
              <div style="margin: 10px 0"><strong>主题色</strong></div>
              <el-button type="primary">ボタン</el-button>
              <el-button type="success">ボタン</el-button>
              <el-button type="warning">ボタン</el-button>
              <el-button type="danger">ボタン</el-button>
              <el-button type="info">ボタン</el-button>
            </div>
          </el-card>

        </el-main>

      </el-container>

    </el-container>


    <p style="position: absolute; top: 33%; transform: translateY(-50%); font-size: 24px; color: #333; text-align: center; width: 100%;">
      ホームページ</p>

    <!--    &lt;!&ndash; 仅保留两个跳转标签 &ndash;&gt;
        <router-link to="/login" style="position: absolute; top: 10px; right: 10px; color: #333; text-decoration: none; margin-right: 10px;">ログアウト</router-link>
        <router-link to="/logout" style="position: absolute; top: 10px; right: 140px; color: #333; text-decoration: none;">個人情報</router-link>-->

    <!--    <el-dropdown placement="bottom">
          <div>
            <el-dropdown-menu>
              <el-dropdown-item style="position: absolute; top: 10px; right: 10px; color: #333; text-decoration: none; margin-right: 10px;">個人情報</el-dropdown-item>
              <el-dropdown-item style="position: absolute; top: 10px; right: 140px; color: #333; text-decoration: none;">ログアウト</el-dropdown-item>
            </el-dropdown-menu>
          </div>
        </el-dropdown>-->

  </div>
</template>

<script>
export default {
  name: 'HomeView',
  data(){
    return{
      isCollapse: false, //不收缩
      asideWidth: '200px',
      collapseIcon:'el-icon-fold'
    }
  },
  methods:{
    handleCollapse(){
      this.isCollapse = !this.isCollapse
      this.asideWidth = this.isCollapse ? '64px' : '200px'
      this.collapseIcon = this.isCollapse ? 'el-icon-s-unfold' : 'el-icon-fold'
    }
  }
}


</script>

<style>
.el-menu--inline {
  background-color: #000c17 !important;
}

.el-menu--inline .el-menu-item {
  background-color: #000c17 !important;
  padding-left: 49px !important;
}

.el-menu-item:hover, .el-submenu__title:hover {
  color: #fff !important;
}

.el-submenu__title:hover i {
  color: #fff !important;
}

.el-menu-item.is-active {
  background-color: #1890ff !important;
  border-radius: 5px !important;
  width: calc(100% - 8px);
  margin-left: 4px;
}
.el-menu-item.is-active i, .el-menu-item.is-active .el-tooltip{
  margin-left: -4px;
}
.el-menu-item {
  height: 40px !important;
  line-height: 40px !important;
}

.el-submenu__title {
  height: 40px !important;
  line-height: 40px !important;
}
.el-submenu__icon-arrow {
  margin-top: -5px;
}
.el-aside{
  transition: width .3s;
  box-shadow: 2px 0 6px rgba(0,21,41,.35);
}
.logo-title{
  margin-left: 5px;
  font-size: 18px;
  transition: all .3s;
}
.el-header{
  box-shadow: 2px 0 6px rgba(0,21,41,.35);
  display: flex;
  align-items: center;
}
.my-dropdown[x-placement^="bottom"] .el-dropdown-menu {
  top: 0;
}

.my-dropdown[x-placement^="bottom"] .el-dropdown-menu:after {
  top: 0;
}
</style>