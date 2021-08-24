<template>
  <el-card>
    <div class="bloger"><h1>郑景深</h1></div>
    <div class="intro">
      <span><i class="iconfont el-icon-location"></i>&nbsp;深圳&南山</span>
      <span><i class="iconfont el-icon-job"></i>&nbsp;后端研发工程师</span>
    </div>
    <!--GitHub QQ-->
    <div class="link">
      <i class="iconfont el-icon-GitHub"></i>
      <i class="iconfont el-icon-weixin"></i>
    </div>
  </el-card>
</template>
<script>
export default{
  name:'CardMe',
}
</script>
<style scoped>
.link i{
  font-size: 32px;
}

.link{
  margin:20px;
}
.intro{
  margin-top:12px;
  font-weight: 400;
  line-height: 24px;
  font-size: 16px;
}

.intro span i{
  font-size: 20px;
}

.el-card{
  text-align: center;
}
.bloger{
  border-bottom-color: var(--primary);
  border-bottom-style: solid;
  border-bottom-width: 2px;
}
.bloger h1{
  margin-bottom: 2px;
}
.el-icon-GitHub{
  margin-right: 12px;
}

.el-icon-weixin{
  margin-left: 12px;
}
</style>
