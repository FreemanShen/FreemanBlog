<template>
<el-main v-title data-title="Freeman Index">
  <div class="index-main">
    <article-scroll-page></article-scroll-page>
  </div>
  <div class="index-aside">
    <card-me></card-me>
    <card-tag></card-tag>
    <card-article></card-article>
    <card-archive></card-archive>
    <card-article></card-article>
  </div>

</el-main>
</template>
<script>
import CardMe from '@/components/card/CardMe'
import CardTag from '@/components/card/CardTag'
import CardArticle from '@/components/card/CardArticle'
import CardArchive from '@/components/card/CardArchive'
import ArticleScrollPage from '@/components/index/ArticleScrollPage'

export default{
  name:'Index',
  components:{
    CardMe,
    CardTag,
    CardArticle,
    CardArchive,
    ArticleScrollPage
  }
}
</script>
<style scoped>
.el-main{
  display: flex;
  align-items: flex-start;
  margin-left:auto;
  margin-right: auto;
}
.index-aside{
  margin-left: 20px;
}
</style>
