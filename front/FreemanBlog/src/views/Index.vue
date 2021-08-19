<template>
<el-main v-title data-title="Freeman Index">
  <el-container>
    <el-main>
      <article-scroll-page></article-scroll-page>
    </el-main>
    <!--
    <el-aside>
      <card-me></card-me>
      <card-tag></card-tag>
      <card-article></card-article>
      <card-archive></card-archive>
      <card-article></card-article>
    </el-aside>
    -->
  </el-container>
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
