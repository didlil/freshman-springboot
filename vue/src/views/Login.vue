<!--<template>-->
<!--  <div style="height: 100vh;display: flex;align-items: center; justify-content: center; background-color: gainsboro">-->
<!--    <div style="display: flex; background-color: white; width: 60%; border-radius: 5px; overflow: hidden">-->
<!--      <div style="flex: 1">-->
<!--        <img src="@/assets/login.jpg" alt="" style="width: 100%; display: flex">-->
<!--      </div>-->
<!--      <div style="flex: 1; display: flex; align-items: center; justify-content: center">-->
<!--        <el-form :model="user" style="width: auto" :rules="rules" ref="loginRef">-->
<!--          <div style="font-size: 20px; font-weight: lighter; text-align: center;margin-bottom: 10px;">ようこそ</div>-->
<!--          <el-form-item prop="username"> &lt;!&ndash; Corrected from el-menu-item to el-form-item &ndash;&gt;-->
<!--            <el-input prefix-icon="el-icon-user" size="medium" placeholder="アカウントを入力して"-->
<!--                      v-model="user.username"></el-input>-->
<!--          </el-form-item>-->
<!--          <el-form-item prop="password"> &lt;!&ndash; Corrected from el-menu-item to el-form-item &ndash;&gt;-->
<!--            <el-input prefix-icon="el-icon-lock" size="medium" show-password placeholder="パスワードを入力して"-->
<!--                      v-model="user.password"></el-input>-->
<!--          </el-form-item>-->
<!--          <el-form-item prop="code">-->
<!--            <div style="display: flex; height: 36px">-->
<!--              <el-input prefix-icon="el-icon-circle-check" size="medium" style="flex: 1;"-->
<!--                        v-model="user.code"></el-input>-->
<!--              <div style="flex: 1; height: 36px">-->
<!--                <valid-code @updata:value="getCode"/>-->
<!--              </div>-->
<!--            </div>-->
<!--          </el-form-item>-->
<!--          <el-form-item>-->
<!--            <el-button type="primary" style="width: 100%" @click="login">ログイン</el-button>-->
<!--          </el-form-item>-->
<!--          <div style="display: flex">-->
<!--            <div style="font-size: small; flex: 1">新規会員 <span style="color: dodgerblue;cursor: pointer" @click="$router.push('/register')">登録</span></div>-->
<!--            <div style="font-size: small; flex: 1; text-align: right"><span style="color: dodgerblue;cursor: pointer">パスワードを忘れた場合</span></div>-->
<!--          </div>-->
<!--        </el-form>-->
<!--      </div>-->
<!--    </div>-->
<!--  </div>-->
<!--</template>-->

<!--<script>-->
<!--import ValidCode from "@/components/ValidCode.vue";-->

<!--export default {-->
<!--  name: "Login",-->
<!--  components: {-->
<!--    ValidCode-->
<!--  },-->
<!--  data() {-->

<!--    //验证码校验-->
<!--    const validateCode = (rule, value, callback) => {-->
<!--      if (value === '') {-->
<!--        callback(new Error('確認コードを入力して'))-->
<!--      } else if (value.toLowerCase() !== this.code) {-->
<!--        callback(new Error('認証コードの入力が間違っています'))-->
<!--      } else {-->
<!--        callback();-->
<!--      }-->
<!--    }-->

<!--    return {-->
<!--      code: '', //验证码组件传递过来的code-->
<!--      user: {-->
<!--        code: '', //表单里用户输入的code-->
<!--        username: '',-->
<!--        password: ''-->
<!--      },-->
<!--      rules: {-->
<!--        username: [-->
<!--          {required: true, message: 'アカウントを入力して', trigger: 'blur'},-->
<!--        ],-->
<!--        password: [-->
<!--          {required: true, message: 'パスワードを入力して', trigger: 'blur'},-->
<!--        ],-->
<!--        code: [-->
<!--          {validator: validateCode, trigger: 'blur'}-->
<!--        ]-->
<!--      }-->
<!--    }-->
<!--  },-->
<!--  created() {-->
<!--  },-->
<!--  methods: {-->
<!--    getCode(code) {-->
<!--      console.log(code)-->
<!--      this.code = code.toLowerCase()-->
<!--    },-->
<!--    login() {-->
<!--      this.$refs['loginRef'].validate((valid) => {-->
<!--        if (valid) {-->
<!--          //验证通过-->
<!--          this.$request.post("/login", this.user).then(res => {-->
<!--            if (res.code === '200') {-->
<!--              this.$router.push('/')-->
<!--              this.$message.success('ログイン成功')-->
<!--            } else {-->
<!--              this.$message.error(res.msg)-->
<!--            }-->
<!--          })-->
<!--        }-->
<!--      })-->
<!--    }-->
<!--  }-->
<!--}-->


<!--</script>-->

<!--<style scoped>-->

<!--</style>-->

<template>
  <div style="height: 100vh; display: flex; align-items: center; justify-content: center; background-color: aliceblue">
    <div style="display: flex; background-color: white; width: 50%; border-radius: 5px; overflow: hidden">
      <div style="flex: 1">
        <img src="@/assets/login111.png" alt="" style="width: 100%">
      </div>
      <div style="flex: 1; display: flex; align-items: center; justify-content: center">
        <el-form :model="user" style="width: 80%" :rules="rules" ref="loginRef">
          <div style="font-size: 20px; font-weight: bold; text-align: center; margin-bottom: 20px">ようこそ</div>
          <el-form-item prop="username">
            <el-input prefix-icon="el-icon-user" size="medium" placeholder="アカウント" v-model="user.username"></el-input>
          </el-form-item>
          <el-form-item prop="password">
            <el-input prefix-icon="el-icon-lock" size="medium" show-password placeholder="パスワード" v-model="user.password"></el-input>
          </el-form-item>
          <el-form-item prop="code">
            <div style="display: flex">
              <el-input placeholder="確認コード" prefix-icon="el-icon-circle-check" size="small" style="flex: 1" v-model="user.code"></el-input>
              <div style="flex: 1; height: 36px">
                <valid-code @update:value="getCode" />
              </div>
            </div>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" style="width: 100%" @click="login">ログイン</el-button>
          </el-form-item>
          <div style="display: flex">
            <div style="font-size: small; flex: 1">新規会員 <span style="color: dodgerblue;cursor: pointer" @click="$router.push('/register')">登録</span></div>
            <div style="font-size: small; flex: 1; text-align: right"><span style="color: dodgerblue;cursor: pointer">ログインできない場合</span></div>
            </div>
        </el-form>
      </div>
    </div>

  </div>
</template>

<script>
import ValidCode from "@/components/ValidCode.vue";

export default {
  name: "Login",
  components: {
    ValidCode
  },
  data() {

    // 验证码校验
    const validateCode = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('入力してください。'))
      } else if (value.toLowerCase() !== this.code) {
        callback(new Error('認証コードが間違っている'))
      } else {
        callback()
      }
    }

    return {
      code: '',  // 验证码组件传递过来的code
      user: {
        code: '',   // 表单里用户输入的code 验证码
        username: '',
        password: ''
      },
      rules: {
        username: [
          { required: true, message: '入力してください。', trigger: 'blur' },
        ],
        password: [
          { required: true, message: '入力してください。', trigger: 'blur' },
        ],
        code: [
          { validator: validateCode, trigger: 'blur' }
        ],
      }
    }
  },
  created() {

  },
  methods: {
    getCode(code) {
      this.code = code.toLowerCase()
    },
    login() {
      this.$refs['loginRef'].validate((valid) => {
        if (valid) {
          // 验证通过
          this.$request.post('/login', this.user).then(res => {
            if (res.code === '200') {
              this.$router.push('/')
              this.$message.success('ログイン成功')
              localStorage.setItem("honey-user", JSON.stringify(res.data))  // 存储用户数据
            } else {
              this.$message.error(res.msg)
            }
          })
        }
      })
    }
  }
}
</script>

<style scoped>

</style>