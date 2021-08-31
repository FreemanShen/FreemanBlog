import base from './base' // 导入接口域名列表
import axios from '@/request/http' // 导入http中创建的axios实例
import qs from 'qs'
// 根据筛选条件，发送筛选请求给后端
const article = {
  getArticleData () {
    return axios.get('http://localhost:8081/article')
  },
  getArticleDataByGet (url, params) {
    // 获取数据
    console.log('getArticleDataByGet Running')
    return axios.get(url, {
      params: params
    })
  },
  getArticleDataByPost (url, params) {
    // 获取数据
    console.log('getArticleDataByPost Running')
    return axios.post(url, qs.stringify(params))
  }
}

export default article
