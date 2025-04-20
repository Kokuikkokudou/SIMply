---
name: Bug report
about: Create a report to help us improve
title: ''
labels: ''
assignees: ''

---

name: Bug Report 🐛
description: バグの詳細を報告します
title: "[Bug] "
labels: [bug]
body:
  - type: textarea
    id: what-happened
    attributes:
      label: 起きたこと
      description: 実際に発生した現象を詳しく書いてください
      placeholder: 例：ボタンを押しても画面遷移しない
  - type: textarea
    id: steps
    attributes:
      label: 再現手順
      description: バグを再現できる手順を書いてください
      placeholder: 1. ログイン 2. SIM一覧へ 3. …
  - type: textarea
    id: expected
    attributes:
      label: 本来どうなるべき？
